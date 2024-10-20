package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fr")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fr.g")
    public InputStream field2056;

    @ObfuscatedName("fr.r")
    public OutputStream field2055;

    @ObfuscatedName("fr.e")
    public Socket field2057;

    @ObfuscatedName("fr.q")
    public boolean field2058 = false;

    @ObfuscatedName("fr.c")
    public class157 field2060;

    @ObfuscatedName("fr.l")
    public class156 field2062;

    @ObfuscatedName("fr.b")
    public byte[] field2063;

    @ObfuscatedName("fr.w")
    public int field2059 = 0;

    @ObfuscatedName("fr.n")
    public int field2061 = 0;

    @ObfuscatedName("fr.i")
    public boolean field2064 = false;

    @ObfuscatedName("fr.p")
    public final int field2065;

    @ObfuscatedName("fr.m")
    public final int field2066;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2060 = arg1;
        this.field2057 = arg0;
        this.field2065 = arg2;
        this.field2066 = arg2 - 100;
        this.field2057.setSoTimeout(30000);
        this.field2057.setTcpNoDelay(true);
        this.field2057.setReceiveBufferSize(65536);
        this.field2057.setSendBufferSize(65536);
        this.field2056 = this.field2057.getInputStream();
        this.field2055 = this.field2057.getOutputStream();
    }

    @ObfuscatedName("fr.p(I)V")
    public void method3230() {
        if (this.field2058) {
            return;
        }
        synchronized (this) {
            this.field2058 = true;
            this.notifyAll();
        }
        if (this.field2062 != null) {
            while (this.field2062.field2008 == 0) {
                class194.method4976(1L);
            }
            if (this.field2062.field2008 == 1) {
                try {
                    ((Thread) this.field2062.field2012).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2062 = null;
    }

    public void finalize() {
        this.method3230();
    }

    @ObfuscatedName("fr.q(I)I")
    public int method3233() throws IOException {
        return this.field2058 ? 0 : this.field2056.read();
    }

    @ObfuscatedName("fr.e(B)I")
    public int method3227() throws IOException {
        return this.field2058 ? 0 : this.field2056.available();
    }

    @ObfuscatedName("fr.r(II)Z")
    public boolean method3237(int arg0) throws IOException {
        if (this.field2058) {
            return false;
        } else {
            return this.field2056.available() >= arg0;
        }
    }

    @ObfuscatedName("fr.c([BIII)I")
    public int method3228(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2058) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2056.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fr.az([BIIB)V")
    public void method3273(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2058) {
            return;
        }
        if (this.field2064) {
            this.field2064 = false;
            throw new IOException();
        }
        if (this.field2063 == null) {
            this.field2063 = new byte[this.field2065];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2063[this.field2061] = arg0[arg1 + var5];
                this.field2061 = (this.field2061 + 1) % this.field2065;
                if ((this.field2066 + this.field2059) % this.field2065 == this.field2061) {
                    throw new IOException();
                }
            }
            if (this.field2062 == null) {
                this.field2062 = this.field2060.method3200(this, 3);
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
                        if (this.field2061 == this.field2059) {
                            if (this.field2058) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2059;
                        if (this.field2061 >= this.field2059) {
                            var4 = this.field2061 - this.field2059;
                        } else {
                            var4 = this.field2065 - this.field2059;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2055.write(this.field2063, var3, var4);
                    } catch (IOException var12) {
                        this.field2064 = true;
                    }
                    this.field2059 = (this.field2059 + var4) % this.field2065;
                    try {
                        if (this.field2061 == this.field2059) {
                            this.field2055.flush();
                        }
                    } catch (IOException var11) {
                        this.field2064 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2056 != null) {
                        this.field2056.close();
                    }
                    if (this.field2055 != null) {
                        this.field2055.close();
                    }
                    if (this.field2057 != null) {
                        this.field2057.close();
                    }
                } catch (IOException var10) {
                }
                this.field2063 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method1917((String) null, var15);
        }
    }

    @ObfuscatedName("fr.i([BIII)V")
    public void method3234(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3273(arg0, arg1, arg2);
    }
}
