package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fj")
public class class167 {

    @ObfuscatedName("fj.d")
    public Inflater field2338;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fj.d(Lfg;[BI)V")
    public void method2892(class174 arg0, byte[] arg1) {
        if (arg0.field2409[arg0.field2405] != 31 || arg0.field2409[arg0.field2405 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2338 == null) {
            this.field2338 = new Inflater(true);
        }
        try {
            this.field2338.setInput(arg0.field2409, arg0.field2405 + 10, arg0.field2409.length - (arg0.field2405 + 10 + 8));
            this.field2338.inflate(arg1);
        } catch (Exception var4) {
            this.field2338.reset();
            throw new RuntimeException("");
        }
        this.field2338.reset();
    }
}
