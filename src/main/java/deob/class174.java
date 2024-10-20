package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fa")
public class class174 {

    @ObfuscatedName("fa.b")
    public Inflater field2431;

    public class174() {
        this(-1, 1000000, 1000000);
    }

    public class174(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fa.b(Lfs;[BI)V")
    public void method2886(class181 arg0, byte[] arg1) {
        if (arg0.field2495[arg0.field2488] != 31 || arg0.field2495[arg0.field2488 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2431 == null) {
            this.field2431 = new Inflater(true);
        }
        try {
            this.field2431.setInput(arg0.field2495, arg0.field2488 + 10, arg0.field2495.length - (arg0.field2488 + 10 + 8));
            this.field2431.inflate(arg1);
        } catch (Exception var4) {
            this.field2431.reset();
            throw new RuntimeException("");
        }
        this.field2431.reset();
    }
}
