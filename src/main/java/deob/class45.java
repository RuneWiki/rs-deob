package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ao")
public class class45 extends class98 {

    @ObfuscatedName("ao.f")
    public AudioFormat field375;

    @ObfuscatedName("ao.h")
    public SourceDataLine field373;

    @ObfuscatedName("ao.e")
    public int field374;

    @ObfuscatedName("ao.b")
    public byte[] field372;

    @ObfuscatedName("ao.f(I)V")
    public void method656() {
        this.field375 = new AudioFormat((float) Statics.field3801, 16, Statics.field1350 ? 2 : 1, true, false);
        this.field372 = new byte[0x100 << (Statics.field1350 ? 2 : 1)];
    }

    @ObfuscatedName("ao.h(IB)V")
    public void method657(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field375, arg0 << (Statics.field1350 ? 2 : 1));
            this.field373 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field373.open();
            this.field373.start();
            this.field374 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field373 = null;
                throw var11;
            } else {
                this.method657(class190.method2912(arg0));
            }
        }
    }

    @ObfuscatedName("ao.e(I)I")
    public int method659() {
        return this.field374 - (this.field373.available() >> (Statics.field1350 ? 2 : 1));
    }

    @ObfuscatedName("ao.b()V")
    public void method671() {
        int var1 = 256;
        if (Statics.field1350) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1345[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field372[var2 * 2] = (byte) (var3 >> 8);
            this.field372[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field373.write(this.field372, 0, var1 << 1);
    }

    @ObfuscatedName("ao.l(B)V")
    public void method663() {
        if (this.field373 != null) {
            this.field373.close();
            this.field373 = null;
        }
    }

    @ObfuscatedName("ao.w(I)V")
    public void method661() {
        this.field373.flush();
    }
}
