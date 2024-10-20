package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("al")
public class class50 extends class51 {

    @ObfuscatedName("al.z")
    public AudioFormat field1088;

    @ObfuscatedName("al.h")
    public SourceDataLine field1089;

    @ObfuscatedName("al.c")
    public int field1087;

    @ObfuscatedName("al.p")
    public byte[] field1090;

    @ObfuscatedName("al.z(Ljava/awt/Component;)V")
    public void method916(Component arg0) {
        this.field1088 = new AudioFormat((float) Statics.field2409, 16, Statics.field955 ? 2 : 1, true, false);
        this.field1090 = new byte[0x100 << (Statics.field955 ? 2 : 1)];
    }

    @ObfuscatedName("al.h(I)V")
    public void method917(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1088, arg0 << (Statics.field955 ? 2 : 1));
            this.field1089 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1089.open();
            this.field1089.start();
            this.field1087 = arg0;
        } catch (LineUnavailableException var4) {
            if (class123.method678(arg0) == 1) {
                this.field1089 = null;
                throw var4;
            } else {
                this.method917(class123.method2170(arg0));
            }
        }
    }

    @ObfuscatedName("al.c()I")
    public int method918() {
        return this.field1087 - (this.field1089.available() >> (Statics.field955 ? 2 : 1));
    }

    @ObfuscatedName("al.p()V")
    public void method932() {
        int var1 = 256;
        if (Statics.field955) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1092[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1090[var2 * 2] = (byte) (var3 >> 8);
            this.field1090[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1089.write(this.field1090, 0, var1 << 1);
    }

    @ObfuscatedName("al.i()V")
    public void method923() {
        if (this.field1089 != null) {
            this.field1089.close();
            this.field1089 = null;
        }
    }

    @ObfuscatedName("al.v()V")
    public void method921() {
        this.field1089.flush();
    }
}
