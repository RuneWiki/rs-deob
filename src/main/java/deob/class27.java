package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("am")
public class class27 {

    @ObfuscatedName("am.f")
    public int field613;

    @ObfuscatedName("am.i")
    public byte[] field607 = new byte[4];

    @ObfuscatedName("am.u")
    public class103 field608;

    @ObfuscatedName("am.h")
    public DataInputStream field609;

    @ObfuscatedName("am.r")
    public int field611;

    @ObfuscatedName("am.o")
    public byte[] field612;

    @ObfuscatedName("am.l")
    public int field614;

    @ObfuscatedName("am.n")
    public long field615;

    public class27(class104 arg0, URL arg1) {
        this.field608 = arg0.method1887(arg1);
        this.field613 = 0;
        this.field615 = class156.method848() + 30000L;
    }

    @ObfuscatedName("am.f(I)[B")
    public byte[] method563() throws IOException {
        if (class156.method848() > this.field615) {
            throw new IOException();
        }
        if (this.field613 == 0) {
            if (this.field608.field1687 == 2) {
                throw new IOException();
            }
            if (this.field608.field1687 == 1) {
                this.field609 = (DataInputStream) this.field608.field1691;
                this.field613 = 1;
            }
        }
        if (this.field613 == 1) {
            this.field611 += this.field609.read(this.field607, this.field611, this.field607.length - this.field611);
            if (this.field611 == 4) {
                int var1 = (new class154(this.field607)).method2695();
                this.field612 = new byte[var1];
                this.field613 = 2;
            }
        }
        if (this.field613 == 2) {
            this.field614 += this.field609.read(this.field612, this.field614, this.field612.length - this.field614);
            if (this.field614 == this.field612.length) {
                return this.field612;
            }
        }
        return null;
    }
}
