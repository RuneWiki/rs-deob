package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aq")
public class class45 extends class98 {

    @ObfuscatedName("aq.f")
    public AudioFormat field406;

    @ObfuscatedName("aq.l")
    public SourceDataLine field405;

    @ObfuscatedName("aq.w")
    public int field407;

    @ObfuscatedName("aq.s")
    public byte[] field404;

    @ObfuscatedName("aq.f(I)V")
    public void method679() {
        this.field406 = new AudioFormat((float) Statics.field1356, 16, Statics.field2847 ? 2 : 1, true, false);
        this.field404 = new byte[0x100 << (Statics.field2847 ? 2 : 1)];
    }

    @ObfuscatedName("aq.l(II)V")
    public void method680(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field406, arg0 << (Statics.field2847 ? 2 : 1));
            this.field405 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field405.open();
            this.field405.start();
            this.field407 = arg0;
        } catch (LineUnavailableException var11) {
            if (class190.method3135(arg0) == 1) {
                this.field405 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method680(var10);
        }
    }

    @ObfuscatedName("aq.w(I)I")
    public int method681() {
        return this.field407 - (this.field405.available() >> (Statics.field2847 ? 2 : 1));
    }

    @ObfuscatedName("aq.s()V")
    public void method682() {
        int var1 = 256;
        if (Statics.field2847) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1366[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field404[var2 * 2] = (byte) (var3 >> 8);
            this.field404[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field405.write(this.field404, 0, var1 << 1);
    }

    @ObfuscatedName("aq.e(B)V")
    public void method678() {
        if (this.field405 != null) {
            this.field405.close();
            this.field405 = null;
        }
    }

    @ObfuscatedName("aq.c(I)V")
    public void method684() {
        this.field405.flush();
    }
}
