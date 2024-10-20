package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bk")
public class class56 extends class109 {

    @ObfuscatedName("bk.d")
    public AudioFormat field645;

    @ObfuscatedName("bk.x")
    public SourceDataLine field643;

    @ObfuscatedName("bk.k")
    public int field644;

    @ObfuscatedName("bk.z")
    public byte[] field642;

    @ObfuscatedName("bk.d(I)V")
    public void method721() {
        this.field645 = new AudioFormat((float) Statics.field1546, 16, Statics.field1548 ? 2 : 1, true, false);
        this.field642 = new byte[0x100 << (Statics.field1548 ? 2 : 1)];
    }

    @ObfuscatedName("bk.x(II)V")
    public void method708(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field645, arg0 << (Statics.field1548 ? 2 : 1));
            this.field643 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field643.open();
            this.field643.start();
            this.field644 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field643 = null;
                throw var11;
            } else {
                this.method708(class185.method1795(arg0));
            }
        }
    }

    @ObfuscatedName("bk.k(I)I")
    public int method709() {
        return this.field644 - (this.field643.available() >> (Statics.field1548 ? 2 : 1));
    }

    @ObfuscatedName("bk.z()V")
    public void method710() {
        int var1 = 256;
        if (Statics.field1548) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1549[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field642[var2 * 2] = (byte) (var3 >> 8);
            this.field642[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field643.write(this.field642, 0, var1 << 1);
    }

    @ObfuscatedName("bk.v(I)V")
    public void method707() {
        if (this.field643 != null) {
            this.field643.close();
            this.field643 = null;
        }
    }

    @ObfuscatedName("bk.m(B)V")
    public void method713() {
        this.field643.flush();
    }
}
