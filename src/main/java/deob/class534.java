package deob;

import java.util.zip.Inflater;

@ObfuscatedName("un")
public class class534 {

    @ObfuscatedName("un.aw")
    public Inflater field5210;

    public class534() {
        this(-1, 1000000, 1000000);
    }

    public class534(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("un.aw(Lty;[BB)V")
    public void method8872(class514 arg0, byte[] arg1) {
        if (arg0.field5070[arg0.field5072] != 31 || arg0.field5070[arg0.field5072 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5210 == null) {
            this.field5210 = new Inflater(true);
        }
        try {
            this.field5210.setInput(arg0.field5070, arg0.field5072 + 10, arg0.field5070.length - (arg0.field5072 + 10 + 8));
            this.field5210.inflate(arg1);
        } catch (Exception var4) {
            this.field5210.reset();
            throw new RuntimeException("");
        }
        this.field5210.reset();
    }
}
