import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of("https://something.com", "some-thing.html");
        //ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/MyTest.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of("https://google.com", "google.html", "abc.com");
        //ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/FarApart.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        //ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/ImageReference.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        //ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }
}
