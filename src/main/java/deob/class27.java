package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("aq")
public class class27 {

    @ObfuscatedName("aq.b")
    public int field590;

    @ObfuscatedName("aq.e")
    public class103 field589;

    @ObfuscatedName("aq.c")
    public DataInputStream field588;

    @ObfuscatedName("aq.l")
    public byte[] field596 = new byte[4];

    @ObfuscatedName("aq.y")
    public int field592;

    @ObfuscatedName("aq.j")
    public byte[] field591;

    @ObfuscatedName("aq.g")
    public int field594;

    @ObfuscatedName("aq.s")
    public long field595;

    public class27(class104 arg0, URL arg1) {
        this.field589 = arg0.method1918(arg1);
        this.field590 = 0;
        this.field595 = class156.method81() + 30000L;
    }

    @ObfuscatedName("aq.b(I)[B")
    public byte[] method577() throws IOException {
        if (class156.method81() > this.field595) {
            throw new IOException();
        }
        if (this.field590 == 0) {
            if (this.field589.field1652 == 2) {
                throw new IOException();
            }
            if (this.field589.field1652 == 1) {
                this.field588 = (DataInputStream) this.field589.field1656;
                this.field590 = 1;
            }
        }
        if (this.field590 == 1) {
            int var1 = this.field588.available();
            if (var1 > 0) {
                if (this.field592 + var1 > 4) {
                    var1 = 4 - this.field592;
                }
                this.field592 += this.field588.read(this.field596, this.field592, var1);
                if (this.field592 == 4) {
                    int var2 = (new class154(this.field596)).method2815();
                    this.field591 = new byte[var2];
                    this.field590 = 2;
                }
            }
        }
        if (this.field590 == 2) {
            int var3 = this.field588.available();
            if (var3 > 0) {
                if (this.field594 + var3 > this.field591.length) {
                    var3 = this.field591.length - this.field594;
                }
                this.field594 += this.field588.read(this.field591, this.field594, var3);
                if (this.field594 == this.field591.length) {
                    return this.field591;
                }
            }
        }
        return null;
    }
}
