
 # !/bin/bash
 ################################
 # This is a lancher file. 
 # Establishes sockets all the node in the config file.
 #################################

###
# Main body of script starts here
###
echo "Shell script Invoked...."
netid=vxp161830

PROJDIR=$HOME/project2/Non-Greedy
CONFIG=$PROJDIR/config.txt
BINDIR=$PROJDIR/bin/
PROG=Service


cat $CONFIG | sed -e "s/#.*//" | sed -e "/^\s*$/d" |
(
        while  read line 
        do 
                HOST=$(echo $line | awk '{print $2}')
                PORT=$(echo $line | awk '{print $3}')
                NEIGH=$(echo $line | awk '{print $4}')
                echo " params passed:: $PROG :: $HOST : $PORT : $NEIGH"

                ssh -o StrictHostKeyChecking=no $USER@$HOST java -cp $BINDIR $PROG $HOST $PORT $NEIGH > $HOST$PORT &

        done
)
