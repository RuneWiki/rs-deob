package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("an")
public class class25 extends class43 {

    @ObfuscatedName("an.ac")
    public AudioFormat field104;

    @ObfuscatedName("an.ae")
    public SourceDataLine field102;

    @ObfuscatedName("an.ag")
    public int field103;

    @ObfuscatedName("an.am")
    public byte[] field101;

    @ObfuscatedName("an.ac(I)V")
    public void method330() {
        this.field104 = new AudioFormat((float) Statics.field271, 16, Statics.field262 ? 2 : 1, true, false);
        this.field101 = new byte[0x100 << (Statics.field262 ? 2 : 1)];
    }

    @ObfuscatedName("an.ae(II)V")
    public void method314(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field104, arg0 << (Statics.field262 ? 2 : 1));
            this.field102 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field102.open();
            this.field102.start();
            this.field103 = arg0;
        } catch (LineUnavailableException var4) {
            if (class333.method693(arg0) == 1) {
                this.field102 = null;
                throw var4;
            } else {
                this.method314(class333.method44(arg0));
            }
        }
    }

    @ObfuscatedName("an.ag(I)I")
    public int method315() {
        return this.field103 - (this.field102.available() >> (Statics.field262 ? 2 : 1));
    }

    @ObfuscatedName("an.am()V")
    public void method325() {
        int var1 = 256;
        if (Statics.field262) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field265[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field101[var2 * 2] = (byte) (var3 >> 8);
            this.field101[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field102.write(this.field101, 0, var1 << 1);
    }

    @ObfuscatedName("an.ax(I)V")
    public void method317() {
        if (this.field102 != null) {
            this.field102.close();
            this.field102 = null;
        }
    }

    @ObfuscatedName("an.aq(B)V")
    public void method318() {
        this.field102.flush();
    }
}
