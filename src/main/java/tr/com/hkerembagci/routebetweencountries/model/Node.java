package tr.com.hkerembagci.routebetweencountries.model;

import lombok.Data;
import tr.com.hkerembagci.routebetweencountries.entity.Root;
import java.util.List;

@Data
public class Node {

    private Root node;
    private Root previousNode;
    private List<Root> nextNodeList;
    private boolean isDestination;

}