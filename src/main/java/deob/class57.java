package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bw")
public class class57 extends class108 {

    @ObfuscatedName("bw.g")
    public AudioFormat field651;

    @ObfuscatedName("bw.e")
    public SourceDataLine field652;

    @ObfuscatedName("bw.b")
    public int field654;

    @ObfuscatedName("bw.z")
    public byte[] field653;

    @ObfuscatedName("bw.g(B)V")
    public void method761() {
        this.field651 = new AudioFormat((float) Statics.field1550, 16, Statics.field1536 ? 2 : 1, true, false);
        this.field653 = new byte[0x100 << (Statics.field1536 ? 2 : 1)];
    }

    @ObfuscatedName("bw.e(II)V")
    public void method755(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field651, arg0 << (Statics.field1536 ? 2 : 1));
            this.field652 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field652.open();
            this.field652.start();
            this.field654 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field652 = null;
                throw var11;
            } else {
                this.method755(class200.method2426(arg0));
            }
        }
    }

    @ObfuscatedName("bw.b(I)I")
    public int method763() {
        return this.field654 - (this.field652.available() >> (Statics.field1536 ? 2 : 1));
    }

    @ObfuscatedName("bw.z()V")
    public void method756() {
        int var1 = 256;
        if (Statics.field1536) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1541[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field653[var2 * 2] = (byte) (var3 >> 8);
            this.field653[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field652.write(this.field653, 0, var1 << 1);
    }

    @ObfuscatedName("bw.n(I)V")
    public void method757() {
        if (this.field652 != null) {
            this.field652.close();
            this.field652 = null;
        }
    }

    @ObfuscatedName("bw.l(I)V")
    public void method758() {
        this.field652.flush();
    }
}
