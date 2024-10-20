package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aa")
public class class25 extends class43 {

    @ObfuscatedName("aa.ap")
    public AudioFormat field95;

    @ObfuscatedName("aa.aw")
    public SourceDataLine field94;

    @ObfuscatedName("aa.ak")
    public int field93;

    @ObfuscatedName("aa.aj")
    public byte[] field96;

    @ObfuscatedName("aa.ap(B)V")
    public void method336() {
        this.field95 = new AudioFormat((float) Statics.field1060, 16, Statics.field5411 ? 2 : 1, true, false);
        this.field96 = new byte[0x100 << (Statics.field5411 ? 2 : 1)];
    }

    @ObfuscatedName("aa.aw(II)V")
    public void method331(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field95, arg0 << (Statics.field5411 ? 2 : 1));
            this.field94 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field94.open();
            this.field94.start();
            this.field93 = arg0;
        } catch (LineUnavailableException var4) {
            if (class332.method7504(arg0) == 1) {
                this.field94 = null;
                throw var4;
            } else {
                this.method331(class332.method2832(arg0));
            }
        }
    }

    @ObfuscatedName("aa.ak(B)I")
    public int method332() {
        return this.field93 - (this.field94.available() >> (Statics.field5411 ? 2 : 1));
    }

    @ObfuscatedName("aa.aj()V")
    public void method333() {
        int var1 = 256;
        if (Statics.field5411) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field257[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field96[var2 * 2] = (byte) (var3 >> 8);
            this.field96[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field94.write(this.field96, 0, var1 << 1);
    }

    @ObfuscatedName("aa.ai(B)V")
    public void method330() {
        if (this.field94 != null) {
            this.field94.close();
            this.field94 = null;
        }
    }

    @ObfuscatedName("aa.ay(I)V")
    public void method339() {
        this.field94.flush();
    }
}
