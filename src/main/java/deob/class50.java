package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ac")
public class class50 extends class51 {

    @ObfuscatedName("ac.g")
    public AudioFormat field1081;

    @ObfuscatedName("ac.e")
    public SourceDataLine field1080;

    @ObfuscatedName("ac.n")
    public int field1082;

    @ObfuscatedName("ac.j")
    public byte[] field1083;

    @ObfuscatedName("ac.g(Ljava/awt/Component;)V")
    public void method923(Component arg0) {
        this.field1081 = new AudioFormat((float) Statics.field1989, 16, Statics.field1970 ? 2 : 1, true, false);
        this.field1083 = new byte[0x100 << (Statics.field1970 ? 2 : 1)];
    }

    @ObfuscatedName("ac.e(I)V")
    public void method945(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1081, arg0 << (Statics.field1970 ? 2 : 1));
            this.field1080 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1080.open();
            this.field1080.start();
            this.field1082 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1080 = null;
                throw var11;
            } else {
                this.method945(class123.method545(arg0));
            }
        }
    }

    @ObfuscatedName("ac.n()I")
    public int method925() {
        return this.field1082 - (this.field1080.available() >> (Statics.field1970 ? 2 : 1));
    }

    @ObfuscatedName("ac.j()V")
    public void method926() {
        int var1 = 256;
        if (Statics.field1970) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1085[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1083[var2 * 2] = (byte) (var3 >> 8);
            this.field1083[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1080.write(this.field1083, 0, var1 << 1);
    }

    @ObfuscatedName("ac.i()V")
    public void method924() {
        if (this.field1080 != null) {
            this.field1080.close();
            this.field1080 = null;
        }
    }

    @ObfuscatedName("ac.o()V")
    public void method928() {
        this.field1080.flush();
    }
}
