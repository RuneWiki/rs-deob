package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("be")
public class class57 extends class108 {

    @ObfuscatedName("be.t")
    public AudioFormat field632;

    @ObfuscatedName("be.q")
    public SourceDataLine field633;

    @ObfuscatedName("be.i")
    public int field635;

    @ObfuscatedName("be.a")
    public byte[] field634;

    @ObfuscatedName("be.t(I)V")
    public void method748() {
        this.field632 = new AudioFormat((float) Statics.field1558, 16, Statics.field1537 ? 2 : 1, true, false);
        this.field634 = new byte[0x100 << (Statics.field1537 ? 2 : 1)];
    }

    @ObfuscatedName("be.q(IB)V")
    public void method750(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field632, arg0 << (Statics.field1537 ? 2 : 1));
            this.field633 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field633.open();
            this.field633.start();
            this.field635 = arg0;
        } catch (LineUnavailableException var11) {
            if (class200.method2846(arg0) == 1) {
                this.field633 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method750(var10);
        }
    }

    @ObfuscatedName("be.i(I)I")
    public int method751() {
        return this.field635 - (this.field633.available() >> (Statics.field1537 ? 2 : 1));
    }

    @ObfuscatedName("be.a()V")
    public void method759() {
        int var1 = 256;
        if (Statics.field1537) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1545[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field634[var2 * 2] = (byte) (var3 >> 8);
            this.field634[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field633.write(this.field634, 0, var1 << 1);
    }

    @ObfuscatedName("be.l(B)V")
    public void method753() {
        if (this.field633 != null) {
            this.field633.close();
            this.field633 = null;
        }
    }

    @ObfuscatedName("be.b(I)V")
    public void method754() {
        this.field633.flush();
    }
}
