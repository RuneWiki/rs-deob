package deob;

import java.util.zip.Inflater;

@ObfuscatedName("gj")
public class class187 {

    @ObfuscatedName("gj.b")
    public Inflater field2476;

    public class187() {
        this(-1, 1000000, 1000000);
    }

    public class187(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gj.b(Lgn;[BI)V")
    public void method3167(class194 arg0, byte[] arg1) {
        if (arg0.field2541[arg0.field2538] != 31 || arg0.field2541[arg0.field2538 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2476 == null) {
            this.field2476 = new Inflater(true);
        }
        try {
            this.field2476.setInput(arg0.field2541, arg0.field2538 + 10, arg0.field2541.length - (arg0.field2538 + 10 + 8));
            this.field2476.inflate(arg1);
        } catch (Exception var4) {
            this.field2476.reset();
            throw new RuntimeException("");
        }
        this.field2476.reset();
    }
}
