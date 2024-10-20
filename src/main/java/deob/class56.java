package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bn")
public class class56 extends class109 {

    @ObfuscatedName("bn.a")
    public AudioFormat field617;

    @ObfuscatedName("bn.w")
    public SourceDataLine field620;

    @ObfuscatedName("bn.e")
    public int field619;

    @ObfuscatedName("bn.k")
    public byte[] field618;

    @ObfuscatedName("bn.a(I)V")
    public void method669() {
        this.field617 = new AudioFormat((float) Statics.field715, 16, Statics.field1301 ? 2 : 1, true, false);
        this.field618 = new byte[0x100 << (Statics.field1301 ? 2 : 1)];
    }

    @ObfuscatedName("bn.w(II)V")
    public void method670(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field617, arg0 << (Statics.field1301 ? 2 : 1));
            this.field620 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field620.open();
            this.field620.start();
            this.field619 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field620 = null;
                throw var11;
            } else {
                this.method670(class189.method2871(arg0));
            }
        }
    }

    @ObfuscatedName("bn.e(I)I")
    public int method673() {
        return this.field619 - (this.field620.available() >> (Statics.field1301 ? 2 : 1));
    }

    @ObfuscatedName("bn.k()V")
    public void method675() {
        int var1 = 256;
        if (Statics.field1301) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1526[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field618[var2 * 2] = (byte) (var3 >> 8);
            this.field618[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field620.write(this.field618, 0, var1 << 1);
    }

    @ObfuscatedName("bn.u(I)V")
    public void method684() {
        if (this.field620 != null) {
            this.field620.close();
            this.field620 = null;
        }
    }

    @ObfuscatedName("bn.z(I)V")
    public void method674() {
        this.field620.flush();
    }
}
