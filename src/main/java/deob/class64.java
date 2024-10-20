package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bl")
public class class64 extends class51 {

    @ObfuscatedName("bl.g")
    public AudioFormat field1193;

    @ObfuscatedName("bl.j")
    public SourceDataLine field1191;

    @ObfuscatedName("bl.aq")
    public int field1192;

    @ObfuscatedName("bl.az")
    public byte[] field1190;

    @ObfuscatedName("bl.g(Ljava/awt/Component;)V")
    public void method894(Component arg0) {
        this.field1193 = new AudioFormat((float) Statics.field1093, 16, Statics.field1079 ? 2 : 1, true, false);
        this.field1190 = new byte[0x100 << (Statics.field1079 ? 2 : 1)];
    }

    @ObfuscatedName("bl.j(I)V")
    public void method902(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1193, arg0 << (Statics.field1079 ? 2 : 1));
            this.field1191 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1191.open();
            this.field1191.start();
            this.field1192 = arg0;
        } catch (LineUnavailableException var4) {
            if (class115.method25(arg0) == 1) {
                this.field1191 = null;
                throw var4;
            } else {
                this.method902(class115.method669(arg0));
            }
        }
    }

    @ObfuscatedName("bl.z()I")
    public int method895() {
        return this.field1192 - (this.field1191.available() >> (Statics.field1079 ? 2 : 1));
    }

    @ObfuscatedName("bl.b()V")
    public void method896() {
        int var1 = 256;
        if (Statics.field1079) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1082[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1190[var2 * 2] = (byte) (var3 >> 8);
            this.field1190[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1191.write(this.field1190, 0, var1 << 1);
    }

    @ObfuscatedName("bl.k()V")
    public void method909() {
        if (this.field1191 != null) {
            this.field1191.close();
            this.field1191 = null;
        }
    }

    @ObfuscatedName("bl.c()V")
    public void method898() {
        this.field1191.flush();
    }
}
