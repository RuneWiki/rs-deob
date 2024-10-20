package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fa")
public final class class181 extends class316 implements Runnable {

    @ObfuscatedName("fa.f")
    public InputStream field2101;

    @ObfuscatedName("fa.b")
    public OutputStream field2107;

    @ObfuscatedName("fa.l")
    public Socket field2093;

    @ObfuscatedName("fa.m")
    public boolean field2095 = false;

    @ObfuscatedName("fa.z")
    public class176 field2100;

    @ObfuscatedName("fa.q")
    public class175 field2097;

    @ObfuscatedName("fa.k")
    public byte[] field2098;

    @ObfuscatedName("fa.c")
    public int field2099 = 0;

    @ObfuscatedName("fa.u")
    public int field2096 = 0;

    @ObfuscatedName("fa.t")
    public boolean field2105 = false;

    @ObfuscatedName("fa.e")
    public final int field2102;

    @ObfuscatedName("fa.o")
    public final int field2103;

    public class181(Socket arg0, class176 arg1, int arg2) throws IOException {
        this.field2100 = arg1;
        this.field2093 = arg0;
        this.field2102 = arg2;
        this.field2103 = arg2 - 100;
        this.field2093.setSoTimeout(30000);
        this.field2093.setTcpNoDelay(true);
        this.field2093.setReceiveBufferSize(65536);
        this.field2093.setSendBufferSize(65536);
        this.field2101 = this.field2093.getInputStream();
        this.field2107 = this.field2093.getOutputStream();
    }

    @ObfuscatedName("fa.f(I)V")
    public void method3334() {
        if (this.field2095) {
            return;
        }
        synchronized (this) {
            this.field2095 = true;
            this.notifyAll();
        }
        if (this.field2097 != null) {
            while (this.field2097.field2054 == 0) {
                class309.method735(1L);
            }
            if (this.field2097.field2054 == 1) {
                try {
                    ((Thread) this.field2097.field2058).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2097 = null;
    }

    public void finalize() {
        this.method3334();
    }

    @ObfuscatedName("fa.b(B)I")
    public int method3336() throws IOException {
        return this.field2095 ? 0 : this.field2101.read();
    }

    @ObfuscatedName("fa.l(I)I")
    public int method3337() throws IOException {
        return this.field2095 ? 0 : this.field2101.available();
    }

    @ObfuscatedName("fa.m(II)Z")
    public boolean method3338(int arg0) throws IOException {
        if (this.field2095) {
            return false;
        } else {
            return this.field2101.available() >= arg0;
        }
    }

    @ObfuscatedName("fa.z([BIII)I")
    public int method3339(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2095) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2101.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fa.q([BIIB)V")
    public void method3356(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2095) {
            return;
        }
        if (this.field2105) {
            this.field2105 = false;
            throw new IOException();
        }
        if (this.field2098 == null) {
            this.field2098 = new byte[this.field2102];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2098[this.field2096] = arg0[arg1 + var5];
                this.field2096 = (this.field2096 + 1) % this.field2102;
                if ((this.field2103 + this.field2099) % this.field2102 == this.field2096) {
                    throw new IOException();
                }
            }
            if (this.field2097 == null) {
                this.field2097 = this.field2100.method3287(this, 3);
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
                        if (this.field2099 == this.field2096) {
                            if (this.field2095) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2099;
                        if (this.field2096 >= this.field2099) {
                            var4 = this.field2096 - this.field2099;
                        } else {
                            var4 = this.field2102 - this.field2099;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2107.write(this.field2098, var3, var4);
                    } catch (IOException var12) {
                        this.field2105 = true;
                    }
                    this.field2099 = (this.field2099 + var4) % this.field2102;
                    try {
                        if (this.field2099 == this.field2096) {
                            this.field2107.flush();
                        }
                    } catch (IOException var11) {
                        this.field2105 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2101 != null) {
                        this.field2101.close();
                    }
                    if (this.field2107 != null) {
                        this.field2107.close();
                    }
                    if (this.field2093 != null) {
                        this.field2093.close();
                    }
                } catch (IOException var10) {
                }
                this.field2098 = null;
                break;
            }
        } catch (Exception var15) {
            class352.method2205((String) null, var15);
        }
    }

    @ObfuscatedName("fa.k([BIII)V")
    public void method3341(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3356(arg0, arg1, arg2);
    }
}
