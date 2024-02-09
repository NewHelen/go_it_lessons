package module7.dz3_replaceFirst;

public class GooSearchResult {
    private final String url;

    public GooSearchResult(String url){
        this.url = url;
    }

    public String getUrl (){
        return url;
    }
    // Метод для виділення домену з URL
    public String parseDomain(){

        // Видаляємо "http://" або "https://" з початку url
        String cleanUrl = url.replaceFirst("^(https?://)?", "");

        // Видаляємо все після першого слеша "/"
        cleanUrl = cleanUrl.split("/")[0];

        return cleanUrl;
    }

    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
