package deob;

import java.util.zip.Inflater;

@ObfuscatedName("gm")
public class class188 {

    @ObfuscatedName("gm.o")
    public Inflater field2520;

    public class188() {
        this(-1, 1000000, 1000000);
    }

    public class188(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gm.o(Lgc;[BI)V")
    public void method3147(class195 arg0, byte[] arg1) {
        if (arg0.field2574[arg0.field2575] != 31 || arg0.field2574[arg0.field2575 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2520 == null) {
            this.field2520 = new Inflater(true);
        }
        try {
            this.field2520.setInput(arg0.field2574, arg0.field2575 + 10, arg0.field2574.length - (arg0.field2575 + 10 + 8));
            this.field2520.inflate(arg1);
        } catch (Exception var4) {
            this.field2520.reset();
            throw new RuntimeException("");
        }
        this.field2520.reset();
    }
}
