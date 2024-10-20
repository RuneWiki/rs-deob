package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bb")
public class class60 extends class115 {

    @ObfuscatedName("bb.m")
    public AudioFormat field449;

    @ObfuscatedName("bb.o")
    public SourceDataLine field447;

    @ObfuscatedName("bb.q")
    public int field448;

    @ObfuscatedName("bb.j")
    public byte[] field446;

    @ObfuscatedName("bb.m(I)V")
    public void method767() {
        this.field449 = new AudioFormat((float) Statics.field3114, 16, Statics.field1305 ? 2 : 1, true, false);
        this.field446 = new byte[0x100 << (Statics.field1305 ? 2 : 1)];
    }

    @ObfuscatedName("bb.o(IB)V")
    public void method768(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field449, arg0 << (Statics.field1305 ? 2 : 1));
            this.field447 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field447.open();
            this.field447.start();
            this.field448 = arg0;
        } catch (LineUnavailableException var11) {
            if (class198.method2148(arg0) == 1) {
                this.field447 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method768(var10);
        }
    }

    @ObfuscatedName("bb.q(I)I")
    public int method786() {
        return this.field448 - (this.field447.available() >> (Statics.field1305 ? 2 : 1));
    }

    @ObfuscatedName("bb.j()V")
    public void method770() {
        int var1 = 256;
        if (Statics.field1305) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1439[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field446[var2 * 2] = (byte) (var3 >> 8);
            this.field446[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field447.write(this.field446, 0, var1 << 1);
    }

    @ObfuscatedName("bb.p(I)V")
    public void method781() {
        if (this.field447 != null) {
            this.field447.close();
            this.field447 = null;
        }
    }

    @ObfuscatedName("bb.g(I)V")
    public void method766() {
        this.field447.flush();
    }
}
