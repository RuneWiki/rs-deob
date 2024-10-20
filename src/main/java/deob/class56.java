package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("by")
public class class56 extends class109 {

    @ObfuscatedName("by.n")
    public AudioFormat field645;

    @ObfuscatedName("by.v")
    public SourceDataLine field643;

    @ObfuscatedName("by.y")
    public int field644;

    @ObfuscatedName("by.r")
    public byte[] field646;

    @ObfuscatedName("by.n(I)V")
    public void method686() {
        this.field645 = new AudioFormat((float) Statics.field1542, 16, Statics.field13 ? 2 : 1, true, false);
        this.field646 = new byte[0x100 << (Statics.field13 ? 2 : 1)];
    }

    @ObfuscatedName("by.v(IS)V")
    public void method696(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field645, arg0 << (Statics.field13 ? 2 : 1));
            this.field643 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field643.open();
            this.field643.start();
            this.field644 = arg0;
        } catch (LineUnavailableException var4) {
            if (class189.method2941(arg0) == 1) {
                this.field643 = null;
                throw var4;
            } else {
                this.method696(class189.method3889(arg0));
            }
        }
    }

    @ObfuscatedName("by.y(I)I")
    public int method685() {
        return this.field644 - (this.field643.available() >> (Statics.field13 ? 2 : 1));
    }

    @ObfuscatedName("by.r()V")
    public void method687() {
        int var1 = 256;
        if (Statics.field13) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1551[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field646[var2 * 2] = (byte) (var3 >> 8);
            this.field646[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field643.write(this.field646, 0, var1 << 1);
    }

    @ObfuscatedName("by.h(I)V")
    public void method697() {
        if (this.field643 != null) {
            this.field643.close();
            this.field643 = null;
        }
    }

    @ObfuscatedName("by.d(B)V")
    public void method690() {
        this.field643.flush();
    }
}
