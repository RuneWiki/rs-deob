package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("an")
public class class27 {

    @ObfuscatedName("an.x")
    public int field621;

    @ObfuscatedName("an.j")
    public class103 field619;

    @ObfuscatedName("an.c")
    public DataInputStream field616;

    @ObfuscatedName("an.d")
    public byte[] field617 = new byte[4];

    @ObfuscatedName("an.w")
    public int field618;

    @ObfuscatedName("an.h")
    public byte[] field614;

    @ObfuscatedName("an.u")
    public int field624;

    @ObfuscatedName("an.k")
    public long field615;

    public class27(class104 arg0, URL arg1) {
        this.field619 = arg0.method1919(arg1);
        this.field621 = 0;
        this.field615 = class156.method1888() + 30000L;
    }

    @ObfuscatedName("an.x(I)[B")
    public byte[] method602() throws IOException {
        if (class156.method1888() > this.field615) {
            throw new IOException();
        }
        if (this.field621 == 0) {
            if (this.field619.field1674 == 2) {
                throw new IOException();
            }
            if (this.field619.field1674 == 1) {
                this.field616 = (DataInputStream) this.field619.field1678;
                this.field621 = 1;
            }
        }
        if (this.field621 == 1) {
            this.field618 += this.field616.read(this.field617, this.field618, this.field617.length - this.field618);
            if (this.field618 == 4) {
                int var1 = (new class154(this.field617)).method2644();
                this.field614 = new byte[var1];
                this.field621 = 2;
            }
        }
        if (this.field621 == 2) {
            this.field624 += this.field616.read(this.field614, this.field624, this.field614.length - this.field624);
            if (this.field624 == this.field614.length) {
                return this.field614;
            }
        }
        return null;
    }
}
