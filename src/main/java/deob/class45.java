package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("az")
public class class45 extends class96 {

    @ObfuscatedName("az.z")
    public AudioFormat field374;

    @ObfuscatedName("az.w")
    public SourceDataLine field375;

    @ObfuscatedName("az.s")
    public int field373;

    @ObfuscatedName("az.l")
    public byte[] field376;

    @ObfuscatedName("az.z(I)V")
    public void method639() {
        this.field374 = new AudioFormat((float) Statics.field1301, 16, Statics.field1296 ? 2 : 1, true, false);
        this.field376 = new byte[0x100 << (Statics.field1296 ? 2 : 1)];
    }

    @ObfuscatedName("az.w(IS)V")
    public void method640(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field374, arg0 << (Statics.field1296 ? 2 : 1));
            this.field375 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field375.open();
            this.field375.start();
            this.field373 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field375 = null;
                throw var11;
            } else {
                this.method640(class188.method2961(arg0));
            }
        }
    }

    @ObfuscatedName("az.s(B)I")
    public int method650() {
        return this.field373 - (this.field375.available() >> (Statics.field1296 ? 2 : 1));
    }

    @ObfuscatedName("az.l()V")
    public void method654() {
        int var1 = 256;
        if (Statics.field1296) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1300[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field376[var2 * 2] = (byte) (var3 >> 8);
            this.field376[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field375.write(this.field376, 0, var1 << 1);
    }

    @ObfuscatedName("az.u(I)V")
    public void method643() {
        if (this.field375 != null) {
            this.field375.close();
            this.field375 = null;
        }
    }

    @ObfuscatedName("az.q(I)V")
    public void method644() {
        this.field375.flush();
    }
}
