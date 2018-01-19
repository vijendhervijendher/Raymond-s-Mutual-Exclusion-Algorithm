
#!/bin/bash


# Change this to your netid
netid=vxp161830

#
# Root directory of your project
PROJDIR=$HOME/project2/Non-Greedy

#
# This assumes your config file is named "config.txt"
# and is located in your project directory
#
CONFIG=$PROJDIR/config.txt

#
# Directory your java classes are in
#
BINDIR=$PROJDIR/bin

#
# Your main project class
#
PROG=Greedy

n=1

cat $CONFIG | sed -e "s/#.*//" | sed -e "/^\s*$/d" |
(
   # read i
    echo $i
    while read line 
    do
        host=$( echo $line | awk '{ print $2 }' )

        echo $host
        ssh $netid@$host killall -u $netid &
        sleep 1

        n=$(( n + 1 ))
    done
   
)

