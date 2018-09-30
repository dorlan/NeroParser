package org.tinos.fhmm;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.tinos.obj.FDHMMNode;
import org.tinos.zabbi.DataString;
public interface FDHMMList extends FHMMList{
	public Map<String, FDHMMNode> getMap();
	public void index() throws IOException ;
	public Map<String, FDHMMNode> loopLoadForest(String ctempString) ;
	public Map<String, FDHMMNode> doNeroPostCognitive(FDHMMNode fDHMMNode, String ctempString, int i) ;
	public Map<String, FDHMMNode> doRunNeroPostFIX(int i, String ctempString, FDHMMNode fDHMMNode, List<String> temp);
	public int docheckNeroPostFix(List<String> temp, int j, String ctempString, int i, int find) ;
	public String getEuclid();
	public Map<String, Integer> getWords() ;
	public Map<String, FDHMMNode> getLinkedHashMap() ;
	public void setLinkedHashMap(Map<String, FDHMMNode> linkedHashMap) ;
	@SuppressWarnings(DataString.RAW_TYPES)
	public Map<Integer, Map> getLinkedHashMapRoot();
	@SuppressWarnings(DataString.RAW_TYPES)
	public void setLinkedHashMapRoot(Map<Integer, Map> linkedHashMapRoot);
	public void setEuclid(String euclid) ;
	public void setWords(Map<String, Integer> words);
}