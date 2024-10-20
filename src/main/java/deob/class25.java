package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("at")
public class class25 extends class43 {

    @ObfuscatedName("at.ab")
    public AudioFormat field100;

    @ObfuscatedName("at.ay")
    public SourceDataLine field97;

    @ObfuscatedName("at.an")
    public int field99;

    @ObfuscatedName("at.au")
    public byte[] field98;

    @ObfuscatedName("at.ab(I)V")
    public void method297() {
        this.field100 = new AudioFormat((float) Statics.field5137, 16, Statics.field5023 ? 2 : 1, true, false);
        this.field98 = new byte[0x100 << (Statics.field5023 ? 2 : 1)];
    }

    @ObfuscatedName("at.ay(IB)V")
    public void method298(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field100, arg0 << (Statics.field5023 ? 2 : 1));
            this.field97 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field97.open();
            this.field97.start();
            this.field99 = arg0;
        } catch (LineUnavailableException var4) {
            if (class331.method4209(arg0) == 1) {
                this.field97 = null;
                throw var4;
            } else {
                this.method298(class331.method5556(arg0));
            }
        }
    }

    @ObfuscatedName("at.an(I)I")
    public int method299() {
        return this.field99 - (this.field97.available() >> (Statics.field5023 ? 2 : 1));
    }

    @ObfuscatedName("at.au()V")
    public void method300() {
        int var1 = 256;
        if (Statics.field5023) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field259[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field98[var2 * 2] = (byte) (var3 >> 8);
            this.field98[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field97.write(this.field98, 0, var1 << 1);
    }

    @ObfuscatedName("at.ax(I)V")
    public void method301() {
        if (this.field97 != null) {
            this.field97.close();
            this.field97 = null;
        }
    }

    @ObfuscatedName("at.ao(B)V")
    public void method302() {
        this.field97.flush();
    }
}
