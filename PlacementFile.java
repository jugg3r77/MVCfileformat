/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacementFormatter.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author juan
 */
public class PlacementFile implements Serializable {
    
    String filepath;
    String client;

    public PlacementFile() {
        this.filepath =null;
        this.client=null;
    }
    
    public PlacementFile(String filepath, String client) {
        this.filepath = filepath;
        this.client = client;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getClient() {
        return client;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.filepath);
        hash = 47 * hash + Objects.hashCode(this.client);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlacementFile other = (PlacementFile) obj;
        if (!Objects.equals(this.filepath, other.filepath)) {
            return false;
        }
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlacementFile{" + "filepath=" + filepath + ", client=" + client + '}';
    }
  
}
