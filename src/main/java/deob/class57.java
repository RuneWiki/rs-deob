package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bs")
public class class57 extends class108 {

    @ObfuscatedName("bs.d")
    public AudioFormat field665;

    @ObfuscatedName("bs.z")
    public SourceDataLine field666;

    @ObfuscatedName("bs.n")
    public int field664;

    @ObfuscatedName("bs.r")
    public byte[] field667;

    @ObfuscatedName("bs.d(B)V")
    public void method701() {
        this.field665 = new AudioFormat((float) Statics.field646, 16, Statics.field1557 ? 2 : 1, true, false);
        this.field667 = new byte[0x100 << (Statics.field1557 ? 2 : 1)];
    }

    @ObfuscatedName("bs.z(IB)V")
    public void method706(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field665, arg0 << (Statics.field1557 ? 2 : 1));
            this.field666 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field666.open();
            this.field666.start();
            this.field664 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field666 = null;
                throw var11;
            } else {
                this.method706(class200.method54(arg0));
            }
        }
    }

    @ObfuscatedName("bs.n(I)I")
    public int method702() {
        return this.field664 - (this.field666.available() >> (Statics.field1557 ? 2 : 1));
    }

    @ObfuscatedName("bs.r()V")
    public void method717() {
        int var1 = 256;
        if (Statics.field1557) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1553[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field667[var2 * 2] = (byte) (var3 >> 8);
            this.field667[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field666.write(this.field667, 0, var1 << 1);
    }

    @ObfuscatedName("bs.e(I)V")
    public void method704() {
        if (this.field666 != null) {
            this.field666.close();
            this.field666 = null;
        }
    }

    @ObfuscatedName("bs.y(I)V")
    public void method713() {
        this.field666.flush();
    }
}
