package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("at")
public class class51 extends class106 {

    @ObfuscatedName("at.a")
    public AudioFormat field406;

    @ObfuscatedName("at.t")
    public SourceDataLine field404;

    @ObfuscatedName("at.n")
    public int field405;

    @ObfuscatedName("at.q")
    public byte[] field403;

    @ObfuscatedName("at.a(B)V")
    public void method766() {
        this.field406 = new AudioFormat((float) Statics.field1392, 16, Statics.field544 ? 2 : 1, true, false);
        this.field403 = new byte[0x100 << (Statics.field544 ? 2 : 1)];
    }

    @ObfuscatedName("at.t(II)V")
    public void method767(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field406, arg0 << (Statics.field544 ? 2 : 1));
            this.field404 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field404.open();
            this.field404.start();
            this.field405 = arg0;
        } catch (LineUnavailableException var11) {
            if (class189.method1947(arg0) == 1) {
                this.field404 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method767(var10);
        }
    }

    @ObfuscatedName("at.n(I)I")
    public int method770() {
        return this.field405 - (this.field404.available() >> (Statics.field544 ? 2 : 1));
    }

    @ObfuscatedName("at.q()V")
    public void method787() {
        int var1 = 256;
        if (Statics.field544) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1386[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field403[var2 * 2] = (byte) (var3 >> 8);
            this.field403[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field404.write(this.field403, 0, var1 << 1);
    }

    @ObfuscatedName("at.v(I)V")
    public void method786() {
        if (this.field404 != null) {
            this.field404.close();
            this.field404 = null;
        }
    }

    @ObfuscatedName("at.l(I)V")
    public void method771() {
        this.field404.flush();
    }
}
