package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fm")
public class class167 {

    @ObfuscatedName("fm.i")
    public Inflater field2306;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fm.i(Lfv;[BI)V")
    public void method2858(class174 arg0, byte[] arg1) {
        if (arg0.field2387[arg0.field2384] != 31 || arg0.field2387[arg0.field2384 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2306 == null) {
            this.field2306 = new Inflater(true);
        }
        try {
            this.field2306.setInput(arg0.field2387, arg0.field2384 + 10, arg0.field2387.length - (arg0.field2384 + 10 + 8));
            this.field2306.inflate(arg1);
        } catch (Exception var4) {
            this.field2306.reset();
            throw new RuntimeException("");
        }
        this.field2306.reset();
    }
}
