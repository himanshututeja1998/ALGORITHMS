*ArrayList<ArrayList<Integer>> list: represent graph containing vertices
                                    and edges between them
*vis[]: boolean array to represent visited vertex
*s: starting vertex 
*/
class Traversal
{
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
    {
       // add your code here
       Queue<Integer> q=new LinkedList<Integer>();
       vis[s]=true;
       q.add(s);
       //System.out.print(s+" ");
       while(!q.isEmpty())
       {
           int temp=q.poll();
           System.out.print(temp+" ");
           for(int i=0;i<list.get(temp).size();i++)
           {
               if(vis[list.get(temp).get(i)]!=true)
               {
                   q.add(list.get(temp).get(i));
                   vis[list.get(temp).get(i)]=true;
               }
           }
       }
    }
}
