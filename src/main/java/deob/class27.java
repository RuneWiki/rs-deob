package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("am")
public class class27 {

    @ObfuscatedName("am.o")
    public int field600;

    @ObfuscatedName("am.m")
    public class103 field598;

    @ObfuscatedName("am.b")
    public DataInputStream field592;

    @ObfuscatedName("am.g")
    public byte[] field593 = new byte[4];

    @ObfuscatedName("am.h")
    public int field594;

    @ObfuscatedName("am.v")
    public byte[] field595;

    @ObfuscatedName("am.l")
    public int field596;

    @ObfuscatedName("am.c")
    public long field591;

    public class27(class104 arg0, URL arg1) {
        this.field598 = arg0.method1815(arg1);
        this.field600 = 0;
        this.field591 = class156.method2009() + 30000L;
    }

    @ObfuscatedName("am.o(I)[B")
    public byte[] method568() throws IOException {
        if (class156.method2009() > this.field591) {
            throw new IOException();
        }
        if (this.field600 == 0) {
            if (this.field598.field1665 == 2) {
                throw new IOException();
            }
            if (this.field598.field1665 == 1) {
                this.field592 = (DataInputStream) this.field598.field1663;
                this.field600 = 1;
            }
        }
        if (this.field600 == 1) {
            int var1 = this.field592.available();
            if (var1 > 0) {
                if (this.field594 + var1 > 4) {
                    var1 = 4 - this.field594;
                }
                this.field594 += this.field592.read(this.field593, this.field594, var1);
                if (this.field594 == 4) {
                    int var2 = (new class154(this.field593)).method2557();
                    this.field595 = new byte[var2];
                    this.field600 = 2;
                }
            }
        }
        if (this.field600 == 2) {
            int var3 = this.field592.available();
            if (var3 > 0) {
                if (this.field596 + var3 > this.field595.length) {
                    var3 = this.field595.length - this.field596;
                }
                this.field596 += this.field592.read(this.field595, this.field596, var3);
                if (this.field596 == this.field595.length) {
                    return this.field595;
                }
            }
        }
        return null;
    }
}
