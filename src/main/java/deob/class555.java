package deob;

import java.util.zip.Inflater;

@ObfuscatedName("vs")
public class class555 {

    @ObfuscatedName("vs.az")
    public Inflater field5376;

    public class555() {
        this(-1, 1000000, 1000000);
    }

    public class555(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("vs.az(Lur;[BI)V")
    public void method9070(class535 arg0, byte[] arg1) {
        if (arg0.field5231[arg0.field5233] != 31 || arg0.field5231[arg0.field5233 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5376 == null) {
            this.field5376 = new Inflater(true);
        }
        try {
            this.field5376.setInput(arg0.field5231, arg0.field5233 + 10, arg0.field5231.length - (arg0.field5233 + 10 + 8));
            this.field5376.inflate(arg1);
        } catch (Exception var4) {
            this.field5376.reset();
            throw new RuntimeException("");
        }
        this.field5376.reset();
    }
}
