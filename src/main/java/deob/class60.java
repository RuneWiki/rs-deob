package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bz")
public class class60 extends class115 {

    @ObfuscatedName("bz.h")
    public AudioFormat field436;

    @ObfuscatedName("bz.v")
    public SourceDataLine field437;

    @ObfuscatedName("bz.x")
    public int field438;

    @ObfuscatedName("bz.w")
    public byte[] field439;

    @ObfuscatedName("bz.h(B)V")
    public void method798() {
        this.field436 = new AudioFormat((float) Statics.field1444, 16, Statics.field1422 ? 2 : 1, true, false);
        this.field439 = new byte[0x100 << (Statics.field1422 ? 2 : 1)];
    }

    @ObfuscatedName("bz.v(IS)V")
    public void method799(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field436, arg0 << (Statics.field1422 ? 2 : 1));
            this.field437 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field437.open();
            this.field437.start();
            this.field438 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field437 = null;
                throw var11;
            } else {
                this.method799(class198.method1722(arg0));
            }
        }
    }

    @ObfuscatedName("bz.x(B)I")
    public int method807() {
        return this.field438 - (this.field437.available() >> (Statics.field1422 ? 2 : 1));
    }

    @ObfuscatedName("bz.w()V")
    public void method801() {
        int var1 = 256;
        if (Statics.field1422) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1427[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field439[var2 * 2] = (byte) (var3 >> 8);
            this.field439[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field437.write(this.field439, 0, var1 << 1);
    }

    @ObfuscatedName("bz.t(I)V")
    public void method802() {
        if (this.field437 != null) {
            this.field437.close();
            this.field437 = null;
        }
    }

    @ObfuscatedName("bz.j(B)V")
    public void method804() {
        this.field437.flush();
    }
}
