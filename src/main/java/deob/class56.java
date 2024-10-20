package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bv")
public class class56 extends class110 {

    @ObfuscatedName("bv.i")
    public AudioFormat field698;

    @ObfuscatedName("bv.w")
    public SourceDataLine field696;

    @ObfuscatedName("bv.a")
    public int field699;

    @ObfuscatedName("bv.t")
    public byte[] field697;

    @ObfuscatedName("bv.i(I)V")
    public void method709() {
        this.field698 = new AudioFormat((float) Statics.field3212, 16, Statics.field1665 ? 2 : 1, true, false);
        this.field697 = new byte[0x100 << (Statics.field1665 ? 2 : 1)];
    }

    @ObfuscatedName("bv.w(II)V")
    public void method710(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field698, arg0 << (Statics.field1665 ? 2 : 1));
            this.field696 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field696.open();
            this.field696.start();
            this.field699 = arg0;
        } catch (LineUnavailableException var4) {
            if (class178.method25(arg0) == 1) {
                this.field696 = null;
                throw var4;
            } else {
                this.method710(class178.method740(arg0));
            }
        }
    }

    @ObfuscatedName("bv.a(B)I")
    public int method716() {
        return this.field699 - (this.field696.available() >> (Statics.field1665 ? 2 : 1));
    }

    @ObfuscatedName("bv.t()V")
    public void method712() {
        int var1 = 256;
        if (Statics.field1665) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1650[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field697[var2 * 2] = (byte) (var3 >> 8);
            this.field697[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field696.write(this.field697, 0, var1 << 1);
    }

    @ObfuscatedName("bv.s(B)V")
    public void method713() {
        if (this.field696 != null) {
            this.field696.close();
            this.field696 = null;
        }
    }

    @ObfuscatedName("bv.r(I)V")
    public void method714() {
        this.field696.flush();
    }
}
