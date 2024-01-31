public class Graph {
    private int[][] WeightMatrix;
    private String[] Nodes;
    private int n;

    public void Graph(int n) {

/*this fucntion is mainly used for declaration, setting lengths for
the weight and node arrays, making n a class wide variable and setting
all the values in the weight array to 0 instead of null*/

        WeightMatrix = new int[n][n];
        Nodes = new String[n];
        this.n = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                WeightMatrix[i][j] = 0;
            }
        }
    }

    public void addNode(String node) {

/*this fucntion uses a linear search to find the next empty
slot in the node array and puts the users input in there*/

        for (int i = 0; i < n; i++) {
            if (Nodes[i] == null) {
                Nodes[i] = node;
            }
        }
    }

    public void newEdge(String n1, String n2, int w) {

/*this function takes the name of 2 nodes, finds there position
in the 1d node array and sets a weight value in the 2d weight array
using there initial position as a set of coordinates */

        int n1_coord = 0;
        int n2_coord = 0;
        for (int i = 0; i < n; i++) {
            if (Nodes[i] == n1) {
                n1_coord = i;
            } else if (Nodes[i] == n2) {
                n2_coord = i;
            }
        }
        WeightMatrix[n1_coord][n2_coord] = w;
        WeightMatrix[n2_coord][n1_coord] = w;
    }

    public int nodeCount() {

/*this functioncounts the number of nodes in the node array but
incrementing count by 1 when a position isn't empty */

        int count=0;
        for (int i = 0; i < n; i++) {
            if (Nodes[i] != null) {
                count++;
            }
        }
        return count;
    }
    public String nodeList() {

/*this function increments through the node array checking for
positions that have a value, if they do it adds them to the end
of the string (concatenation)*/

        String list = "Your current nodes are: ";
        for (int i = 0; i < n; i++) {
            if(Nodes[i]!=null){
                list=list+" "+Nodes[i];
            }
        }
        return list;
    }
    public String nodeExists(String node){

/*this function finds the position of the users value in the 1d
node array then searches for all the nodes that share an associated
weight with the users node, if a node has a weight associated then it
concatenates it onto the connected string and returns these names to the user*/

/*note inputs function will not be made as it will return the same results as the
exists function as there is no direction specified at this time, if there were then
i would need a separate inputs function*/

        int coord=0;
        String connected="The current nodes connected to "+node+" are: ";
        for(int i=0;i<n;i++){
            if(Nodes[i]==node){
                coord=i;
            }
        }
        for(int j=0;j<n;j++){
            if(WeightMatrix[j][coord]!=0){
                connected=connected+" "+Nodes[j];
            }
        }
        return connected;
    }
    public int weight(String n1,String n2){

/*this fucntion pulls the positions of the 2 nodes the user enters and uses them
to find there assosiated weight*/

        int n1_coords=0;
        int n2_coords=0;
        for(int i=0;i<n;i++){
            if(Nodes[i]==n1){
                n1_coords=i;
            }
            else if(Nodes[i]==n2){
                n2_coords=i;
            }
        }
        return WeightMatrix[n1_coords][n2_coords];
    }
    int coord=0;
    public void nodeDelete(String node){

/*this function finds the position of the users input in the 1d node array then saves
saves the position, deletes the node, then uses the saved position to remove all associated
weights*/

        for(int i=0;i<n;i++){
            if(Nodes[i]==node){
                coord=i;
                Nodes[i]=null;
            }
        }
        for(int j=0;j<n;j++){
            WeightMatrix[j][coord]=0;
            WeightMatrix[coord][j]=0;
        }
    }
    public void edgeDelete(String n1,String n2){

/*this function finds the position of the two nodes the user enters, then deletes
any weights associated with those positions ie: removes any edges associated with
the nodes*/

        int n1_coord=0;
        int n2_coord=0;
        for(int i=0;i<n;i++){
            if(Nodes[i]==n1){
                n1_coord=i;
            }
            else if(Nodes[i]==n2){
                n2_coord=i;
            }
        }
        WeightMatrix[n2_coord][n1_coord]=0;
        WeightMatrix[n1_coord][n2_coord]=0;
    }
}
