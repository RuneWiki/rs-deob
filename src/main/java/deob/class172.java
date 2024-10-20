package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fp")
public final class class172 extends class306 implements Runnable {

    @ObfuscatedName("fp.q")
    public InputStream field2069;

    @ObfuscatedName("fp.w")
    public OutputStream field2070;

    @ObfuscatedName("fp.e")
    public Socket field2061;

    @ObfuscatedName("fp.p")
    public boolean field2062 = false;

    @ObfuscatedName("fp.k")
    public class167 field2063;

    @ObfuscatedName("fp.l")
    public class166 field2064;

    @ObfuscatedName("fp.b")
    public byte[] field2065;

    @ObfuscatedName("fp.i")
    public int field2066 = 0;

    @ObfuscatedName("fp.c")
    public int field2068 = 0;

    @ObfuscatedName("fp.f")
    public boolean field2060 = false;

    @ObfuscatedName("fp.m")
    public final int field2067;

    @ObfuscatedName("fp.u")
    public final int field2059;

    public class172(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2063 = arg1;
        this.field2061 = arg0;
        this.field2067 = arg2;
        this.field2059 = arg2 - 100;
        this.field2061.setSoTimeout(30000);
        this.field2061.setTcpNoDelay(true);
        this.field2061.setReceiveBufferSize(65536);
        this.field2061.setSendBufferSize(65536);
        this.field2069 = this.field2061.getInputStream();
        this.field2070 = this.field2061.getOutputStream();
    }

    @ObfuscatedName("fp.q(I)V")
    public void method3204() {
        if (this.field2062) {
            return;
        }
        synchronized (this) {
            this.field2062 = true;
            this.notifyAll();
        }
        if (this.field2064 != null) {
            while (this.field2064.field2023 == 0) {
                class299.method4167(1L);
            }
            if (this.field2064.field2023 == 1) {
                try {
                    ((Thread) this.field2064.field2026).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2064 = null;
    }

    public void finalize() {
        this.method3204();
    }

    @ObfuscatedName("fp.w(B)I")
    public int method3205() throws IOException {
        return this.field2062 ? 0 : this.field2069.read();
    }

    @ObfuscatedName("fp.e(B)I")
    public int method3206() throws IOException {
        return this.field2062 ? 0 : this.field2069.available();
    }

    @ObfuscatedName("fp.p(II)Z")
    public boolean method3216(int arg0) throws IOException {
        if (this.field2062) {
            return false;
        } else {
            return this.field2069.available() >= arg0;
        }
    }

    @ObfuscatedName("fp.k([BIIB)I")
    public int method3208(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2062) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2069.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fp.l([BIII)V")
    public void method3238(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2062) {
            return;
        }
        if (this.field2060) {
            this.field2060 = false;
            throw new IOException();
        }
        if (this.field2065 == null) {
            this.field2065 = new byte[this.field2067];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2065[this.field2068] = arg0[arg1 + var5];
                this.field2068 = (this.field2068 + 1) % this.field2067;
                if ((this.field2066 + this.field2059) % this.field2067 == this.field2068) {
                    throw new IOException();
                }
            }
            if (this.field2064 == null) {
                this.field2064 = this.field2063.method3170(this, 3);
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
                        if (this.field2068 == this.field2066) {
                            if (this.field2062) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2066;
                        if (this.field2068 >= this.field2066) {
                            var4 = this.field2068 - this.field2066;
                        } else {
                            var4 = this.field2067 - this.field2066;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2070.write(this.field2065, var3, var4);
                    } catch (IOException var12) {
                        this.field2060 = true;
                    }
                    this.field2066 = (this.field2066 + var4) % this.field2067;
                    try {
                        if (this.field2068 == this.field2066) {
                            this.field2070.flush();
                        }
                    } catch (IOException var11) {
                        this.field2060 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2069 != null) {
                        this.field2069.close();
                    }
                    if (this.field2070 != null) {
                        this.field2070.close();
                    }
                    if (this.field2061 != null) {
                        this.field2061.close();
                    }
                } catch (IOException var10) {
                }
                this.field2065 = null;
                break;
            }
        } catch (Exception var15) {
            class342.method4173((String) null, var15);
        }
    }

    @ObfuscatedName("fp.b([BIII)V")
    public void method3210(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3238(arg0, arg1, arg2);
    }
}
