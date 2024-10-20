package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("by")
public class class56 extends class110 {

    @ObfuscatedName("by.w")
    public AudioFormat field695;

    @ObfuscatedName("by.o")
    public SourceDataLine field693;

    @ObfuscatedName("by.x")
    public int field694;

    @ObfuscatedName("by.k")
    public byte[] field692;

    @ObfuscatedName("by.w(I)V")
    public void method681() {
        this.field695 = new AudioFormat((float) Statics.field3411, 16, Statics.field1638 ? 2 : 1, true, false);
        this.field692 = new byte[0x100 << (Statics.field1638 ? 2 : 1)];
    }

    @ObfuscatedName("by.o(IB)V")
    public void method677(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field695, arg0 << (Statics.field1638 ? 2 : 1));
            this.field693 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field693.open();
            this.field693.start();
            this.field694 = arg0;
        } catch (LineUnavailableException var4) {
            if (Statics.method143(arg0) == 1) {
                this.field693 = null;
                throw var4;
            } else {
                this.method677(class181.method492(arg0));
            }
        }
    }

    @ObfuscatedName("by.x(I)I")
    public int method678() {
        return this.field694 - (this.field693.available() >> (Statics.field1638 ? 2 : 1));
    }

    @ObfuscatedName("by.k()V")
    public void method687() {
        int var1 = 256;
        if (Statics.field1638) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1646[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field692[var2 * 2] = (byte) (var3 >> 8);
            this.field692[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field693.write(this.field692, 0, var1 << 1);
    }

    @ObfuscatedName("by.f(B)V")
    public void method680() {
        if (this.field693 != null) {
            this.field693.close();
            this.field693 = null;
        }
    }

    @ObfuscatedName("by.i(I)V")
    public void method683() {
        this.field693.flush();
    }
}
