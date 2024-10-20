package deob;

import java.util.zip.Inflater;

@ObfuscatedName("pd")
public class class419 {

    @ObfuscatedName("pd.i")
    public Inflater field4427;

    public class419() {
        this(-1, 1000000, 1000000);
    }

    public class419(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("pd.i(Lop;[BB)V")
    public void method6805(class401 arg0, byte[] arg1) {
        if (arg0.field4302[arg0.field4300] != 31 || arg0.field4302[arg0.field4300 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4427 == null) {
            this.field4427 = new Inflater(true);
        }
        try {
            this.field4427.setInput(arg0.field4302, arg0.field4300 + 10, arg0.field4302.length - (arg0.field4300 + 10 + 8));
            this.field4427.inflate(arg1);
        } catch (Exception var4) {
            this.field4427.reset();
            throw new RuntimeException("");
        }
        this.field4427.reset();
    }
}
