package WhiteBox;

import BlackBox.CycleSort;
import Utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BinaryTreeSerializerTest {

    @Test
    public void serializeNullTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = null;
        String ret = bs.serialize(root);
        assertEquals("[null]",ret);
    }



    //@TODO: Create more tests for serialize
    @Test
    public void serializeSingleTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(2);
        String ret = bs.serialize(root);
        assertEquals("[2,null,null]",ret);
    }
    @Test
    public void serializeLevelTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(2);
        root.left=new TreeNode(3);
        root.right=new TreeNode(4);
        String ret = bs.serialize(root);
        assertEquals("[2,3,4,null,null,null,null]",ret);
    }
    @Test
    public void serializeLevelTest2(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(2);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(5);
        root.right=new TreeNode(4);
        root.right.right=new TreeNode(6);
        String ret = bs.serialize(root);
        assertEquals("[2,3,4,5,null,null,6,null,null,null,null]",ret);
    }
    //no right subtree
    @Test
    public void serializeLevelTest3(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(2);
        root.left=new TreeNode(3);

        String ret = bs.serialize(root);
        assertEquals("[2,3,null,null,null]",ret);
    }
    // Test for deserialize
    @Test
    public void deserializeLenTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[]";
        TreeNode root = null;
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void deserializeLenTest2(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[n]";
        TreeNode root = null;
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void deserializeNullTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[null]";
        TreeNode root = null;
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void deserializeSingleTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[2,null,null]";
        TreeNode root = new TreeNode(2);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void deserializeLevelTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[2,3,null,null,null]";
        TreeNode root = new TreeNode(2);
        root.left=new TreeNode(3);

        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }
    @Test
    public void deserializeLevelTest2(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[2,3,4,null,null,null,null]";
        TreeNode root = new TreeNode(2);
        root.left=new TreeNode(3);
        root.right=new TreeNode(4);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }
    @Test
    public void deserializeLevelTest3(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[1,2,3,4,5,null,null]";
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }
    //if (level.size() == 0) return;
    @Test
    public void deserializeTest7(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[1,null,2,null,3,null,4,null,null,null,null,null]";
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }
}
