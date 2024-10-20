package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fl")
public class class167 {

    @ObfuscatedName("fl.a")
    public Inflater field2329;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fl.a(Lfe;[BB)V")
    public void method2802(class174 arg0, byte[] arg1) {
        if (arg0.field2391[arg0.field2394] != 31 || arg0.field2391[arg0.field2394 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2329 == null) {
            this.field2329 = new Inflater(true);
        }
        try {
            this.field2329.setInput(arg0.field2391, arg0.field2394 + 10, arg0.field2391.length - (arg0.field2394 + 10 + 8));
            this.field2329.inflate(arg1);
        } catch (Exception var4) {
            this.field2329.reset();
            throw new RuntimeException("");
        }
        this.field2329.reset();
    }
}
