package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("as")
public class class51 extends class106 {

    @ObfuscatedName("as.u")
    public AudioFormat field423;

    @ObfuscatedName("as.f")
    public SourceDataLine field421;

    @ObfuscatedName("as.b")
    public int field420;

    @ObfuscatedName("as.g")
    public byte[] field422;

    @ObfuscatedName("as.u(I)V")
    public void method732() {
        this.field423 = new AudioFormat((float) Statics.field1275, 16, Statics.field1409 ? 2 : 1, true, false);
        this.field422 = new byte[0x100 << (Statics.field1409 ? 2 : 1)];
    }

    @ObfuscatedName("as.f(IB)V")
    public void method740(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field423, arg0 << (Statics.field1409 ? 2 : 1));
            this.field421 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field421.open();
            this.field421.start();
            this.field420 = arg0;
        } catch (LineUnavailableException var11) {
            if (class189.method3039(arg0) == 1) {
                this.field421 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method740(var10);
        }
    }

    @ObfuscatedName("as.b(B)I")
    public int method734() {
        return this.field420 - (this.field421.available() >> (Statics.field1409 ? 2 : 1));
    }

    @ObfuscatedName("as.g()V")
    public void method738() {
        int var1 = 256;
        if (Statics.field1409) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1392[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field422[var2 * 2] = (byte) (var3 >> 8);
            this.field422[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field421.write(this.field422, 0, var1 << 1);
    }

    @ObfuscatedName("as.z(I)V")
    public void method744() {
        if (this.field421 != null) {
            this.field421.close();
            this.field421 = null;
        }
    }

    @ObfuscatedName("as.p(B)V")
    public void method736() {
        this.field421.flush();
    }
}
