package com.mycompany.app.function.operator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Graph <T> {
    private Map<T, List<T> > map = new HashMap<>();

    public void addVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T source, T destination,
                        boolean bidirectional)
    {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    public int getVertexCount()
    {
        return map.keySet().size();

    }

    public int getEdgesCount(boolean bidirection)
    {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        
        return count;
    }

    public boolean hasVertex(T s)
    {
        if (map.containsKey(s)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean hasEdge(T vertex_1, T vertex_2)
    {
        if (map.get(vertex_1).contains(vertex_2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeEdge(T vertex_1, T vertex_2)
    {
        if (map.get(vertex_1).contains(vertex_2)) {
            map.get(vertex_1).remove(vertex_2);
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<T> getVertex(){
        ArrayList<T> vertex = new ArrayList<T>();

        for (T v : map.keySet()) {
            vertex.add(v);
        }

        return vertex;
    }

    public ArrayList<T> neighbours(T s)
    {
        ArrayList<T> neighbours = new ArrayList<T>();
        if(!map.containsKey(s)) 
        return neighbours ;
        for(T w:map.get(s))
         neighbours.add(w);
        
         return neighbours;
    }

    @Override public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }


}
