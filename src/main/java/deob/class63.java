package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bn")
public class class63 extends class50 {

    @ObfuscatedName("bn.g")
    public AudioFormat field1183;

    @ObfuscatedName("bn.i")
    public SourceDataLine field1184;

    @ObfuscatedName("bn.ap")
    public int field1186;

    @ObfuscatedName("bn.aj")
    public byte[] field1185;

    @ObfuscatedName("bn.g(Ljava/awt/Component;)V")
    public void method916(Component arg0) {
        this.field1183 = new AudioFormat((float) Statics.field72, 16, Statics.field1089 ? 2 : 1, true, false);
        this.field1185 = new byte[0x100 << (Statics.field1089 ? 2 : 1)];
    }

    @ObfuscatedName("bn.i(I)V")
    public void method915(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1183, arg0 << (Statics.field1089 ? 2 : 1));
            this.field1184 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1184.open();
            this.field1184.start();
            this.field1186 = arg0;
        } catch (LineUnavailableException var4) {
            if (class113.method146(arg0) == 1) {
                this.field1184 = null;
                throw var4;
            } else {
                this.method915(class113.method2661(arg0));
            }
        }
    }

    @ObfuscatedName("bn.k()I")
    public int method934() {
        return this.field1186 - (this.field1184.available() >> (Statics.field1089 ? 2 : 1));
    }

    @ObfuscatedName("bn.e()V")
    public void method918() {
        int var1 = 256;
        if (Statics.field1089) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1077[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1185[var2 * 2] = (byte) (var3 >> 8);
            this.field1185[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1184.write(this.field1185, 0, var1 << 1);
    }

    @ObfuscatedName("bn.w()V")
    public void method919() {
        if (this.field1184 != null) {
            this.field1184.close();
            this.field1184 = null;
        }
    }

    @ObfuscatedName("bn.m()V")
    public void method920() {
        this.field1184.flush();
    }
}
