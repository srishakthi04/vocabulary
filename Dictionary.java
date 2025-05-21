public class Dictionary{
    Map<String,Word> wordMap = new HashMap<>();
 
 
   public Dictionary(){
     addWords();
  }
 
 
private void addWords(){
    wordMap.put("brave",new Word("brave","showing courage/being fearless"));
    wordmap.put("strong",new Word("strong","having great physical/emotional strength"));
    wordMap.put("smart",new Word("smart","intelligent or clever"));
    wordMap.put("kind",new Word("kind","having gentleness"));
    wordMap.put("humble",new Word("humble","having modest attitude"));
    wordMap.put("honest",new Word("honest","truthful and sincere"));
    wordMap.put("loyal",new Word("loyal","very truthfull"));
    wordMap.put("faithfull",new Word("faithfull"," true to facts"));
    wordMap.put("soft",new Word("soft","not rough"));
    wordMap.put("charming",new Word("charming","pleasing or attractive"));
    wordMap.put("cruel",new Word("cruel","causing pain"));
    wordMap.put("sharp",new Word("sharp","mentally quick"));
    wordMap.put("confident",new Word("confident","sure on oneself"));
    wordMap.put("dependable",new Word("dependable","trustworthy and reliable"));
}
public Word getWord(String adjective) {
   return words.get(adjective.toLowerCase());
}
}
