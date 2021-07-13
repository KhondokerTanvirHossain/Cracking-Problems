import java.io.*;
import java.util.StringTokenizer;

public final class ReaderWriter {
    private final BufferedReader bufferedReader;
    private final BufferedWriter bufferedWriter;
    private StringTokenizer stringTokenizer;

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public ReaderWriter() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public String readOneLine() throws IOException {
        String str;
        do {
            str = bufferedReader.readLine();
        } while (str == null || str.equals("\n"));
        return str;
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(getNewTokenFromLine());
    }

    public Double nextDouble() throws IOException {
        return Double.parseDouble(getNewTokenFromLine());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(getNewTokenFromLine());
    }

    private String getNewTokenFromLine() throws IOException {
        while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
            String str = bufferedReader.readLine();
            if (str != null && !str.isEmpty() && !str.equals("\n"))
                stringTokenizer = new StringTokenizer(str);
        }
        return stringTokenizer.nextToken();
    }
}
