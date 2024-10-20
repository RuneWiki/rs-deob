package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bi")
public class class63 extends class50 {

    @ObfuscatedName("bi.j")
    public AudioFormat field1191;

    @ObfuscatedName("bi.z")
    public SourceDataLine field1190;

    @ObfuscatedName("bi.af")
    public int field1189;

    @ObfuscatedName("bi.ak")
    public byte[] field1192;

    @ObfuscatedName("bi.j(Ljava/awt/Component;)V")
    public void method905(Component arg0) {
        this.field1191 = new AudioFormat((float) Statics.field1090, 16, Statics.field1086 ? 2 : 1, true, false);
        this.field1192 = new byte[0x100 << (Statics.field1086 ? 2 : 1)];
    }

    @ObfuscatedName("bi.z(I)V")
    public void method906(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1191, arg0 << (Statics.field1086 ? 2 : 1));
            this.field1190 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1190.open();
            this.field1190.start();
            this.field1189 = arg0;
        } catch (LineUnavailableException var4) {
            if (class113.method160(arg0) == 1) {
                this.field1190 = null;
                throw var4;
            } else {
                this.method906(class113.method1352(arg0));
            }
        }
    }

    @ObfuscatedName("bi.y()I")
    public int method919() {
        return this.field1189 - (this.field1190.available() >> (Statics.field1086 ? 2 : 1));
    }

    @ObfuscatedName("bi.h()V")
    public void method908() {
        int var1 = 256;
        if (Statics.field1086) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1082[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1192[var2 * 2] = (byte) (var3 >> 8);
            this.field1192[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1190.write(this.field1192, 0, var1 << 1);
    }

    @ObfuscatedName("bi.r()V")
    public void method927() {
        if (this.field1190 != null) {
            this.field1190.close();
            this.field1190 = null;
        }
    }

    @ObfuscatedName("bi.e()V")
    public void method910() {
        this.field1190.flush();
    }
}
