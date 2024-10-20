package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ab")
public class class27 {

    @ObfuscatedName("ab.x")
    public int field601;

    @ObfuscatedName("ab.n")
    public class103 field591;

    @ObfuscatedName("ab.g")
    public DataInputStream field592;

    @ObfuscatedName("ab.v")
    public byte[] field593 = new byte[4];

    @ObfuscatedName("ab.y")
    public int field594;

    @ObfuscatedName("ab.p")
    public byte[] field600;

    @ObfuscatedName("ab.j")
    public int field595;

    @ObfuscatedName("ab.m")
    public long field590;

    public class27(class104 arg0, URL arg1) {
        this.field591 = arg0.method1938(arg1);
        this.field601 = 0;
        this.field590 = class156.method1898() + 30000L;
    }

    @ObfuscatedName("ab.x(I)[B")
    public byte[] method618() throws IOException {
        if (class156.method1898() > this.field590) {
            throw new IOException();
        }
        if (this.field601 == 0) {
            if (this.field591.field1671 == 2) {
                throw new IOException();
            }
            if (this.field591.field1671 == 1) {
                this.field592 = (DataInputStream) this.field591.field1675;
                this.field601 = 1;
            }
        }
        if (this.field601 == 1) {
            int var1 = this.field592.available();
            if (var1 > 0) {
                if (this.field594 + var1 > 4) {
                    var1 = 4 - this.field594;
                }
                this.field594 += this.field592.read(this.field593, this.field594, var1);
                if (this.field594 == 4) {
                    int var2 = (new class154(this.field593)).method2803();
                    this.field600 = new byte[var2];
                    this.field601 = 2;
                }
            }
        }
        if (this.field601 == 2) {
            int var3 = this.field592.available();
            if (var3 > 0) {
                if (this.field595 + var3 > this.field600.length) {
                    var3 = this.field600.length - this.field595;
                }
                this.field595 += this.field592.read(this.field600, this.field595, var3);
                if (this.field595 == this.field600.length) {
                    return this.field600;
                }
            }
        }
        return null;
    }
}
