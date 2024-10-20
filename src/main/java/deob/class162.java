package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fr")
public final class class162 extends class158 implements Runnable {

    @ObfuscatedName("fr.z")
    public InputStream field1989;

    @ObfuscatedName("fr.w")
    public OutputStream field1987;

    @ObfuscatedName("fr.s")
    public Socket field1986;

    @ObfuscatedName("fr.l")
    public boolean field1991 = false;

    @ObfuscatedName("fr.u")
    public class155 field1990;

    @ObfuscatedName("fr.q")
    public class154 field1988;

    @ObfuscatedName("fr.k")
    public byte[] field1995;

    @ObfuscatedName("fr.i")
    public int field1993 = 0;

    @ObfuscatedName("fr.x")
    public int field1994 = 0;

    @ObfuscatedName("fr.e")
    public boolean field1999 = false;

    @ObfuscatedName("fr.p")
    public final int field1996;

    @ObfuscatedName("fr.b")
    public final int field1997;

    public class162(Socket arg0, class155 arg1, int arg2) throws IOException {
        this.field1990 = arg1;
        this.field1986 = arg0;
        this.field1996 = arg2;
        this.field1997 = arg2 - 100;
        this.field1986.setSoTimeout(30000);
        this.field1986.setTcpNoDelay(true);
        this.field1986.setReceiveBufferSize(65536);
        this.field1986.setSendBufferSize(65536);
        this.field1989 = this.field1986.getInputStream();
        this.field1987 = this.field1986.getOutputStream();
    }

    @ObfuscatedName("fr.i(I)V")
    public void method3041() {
        if (this.field1991) {
            return;
        }
        synchronized (this) {
            this.field1991 = true;
            this.notifyAll();
        }
        if (this.field1988 != null) {
            while (this.field1988.field1947 == 0) {
                class192.method1435(1L);
            }
            if (this.field1988.field1947 == 1) {
                try {
                    ((Thread) this.field1988.field1945).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1988 = null;
    }

    public void finalize() {
        this.method3041();
    }

    @ObfuscatedName("fr.l(I)I")
    public int method3042() throws IOException {
        return this.field1991 ? 0 : this.field1989.read();
    }

    @ObfuscatedName("fr.s(I)I")
    public int method3037() throws IOException {
        return this.field1991 ? 0 : this.field1989.available();
    }

    @ObfuscatedName("fr.w(IB)Z")
    public boolean method3046(int arg0) throws IOException {
        if (this.field1991) {
            return false;
        } else {
            return this.field1989.available() >= arg0;
        }
    }

    @ObfuscatedName("fr.u([BIII)I")
    public int method3039(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1991) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1989.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fr.ak([BIII)V")
    public void method3072(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1991) {
            return;
        }
        if (this.field1999) {
            this.field1999 = false;
            throw new IOException();
        }
        if (this.field1995 == null) {
            this.field1995 = new byte[this.field1996];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1995[this.field1994] = arg0[arg1 + var5];
                this.field1994 = (this.field1994 + 1) % this.field1996;
                if ((this.field1997 + this.field1993) % this.field1996 == this.field1994) {
                    throw new IOException();
                }
            }
            if (this.field1988 == null) {
                this.field1988 = this.field1990.method3008(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1994 == this.field1993) {
                            if (this.field1991) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1993;
                        if (this.field1994 >= this.field1993) {
                            var4 = this.field1994 - this.field1993;
                        } else {
                            var4 = this.field1996 - this.field1993;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1987.write(this.field1995, var3, var4);
                    } catch (IOException var12) {
                        this.field1999 = true;
                    }
                    this.field1993 = (this.field1993 + var4) % this.field1996;
                    try {
                        if (this.field1994 == this.field1993) {
                            this.field1987.flush();
                        }
                    } catch (IOException var11) {
                        this.field1999 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1989 != null) {
                        this.field1989.close();
                    }
                    if (this.field1987 != null) {
                        this.field1987.close();
                    }
                    if (this.field1986 != null) {
                        this.field1986.close();
                    }
                } catch (IOException var10) {
                }
                this.field1995 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method66((String) null, var15);
        }
    }

    @ObfuscatedName("fr.q([BIIB)V")
    public void method3040(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3072(arg0, arg1, arg2);
    }
}
