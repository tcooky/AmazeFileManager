/*
 * AsyncTaskResult.java
 *
 * Copyright © 2017 Raymond Lai <airwave209gt at gmail.com>.
 *
 * This file is part of AmazeFileManager.
 *
 * AmazeFileManager is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AmazeFileManager is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AmazeFileManager. If not, see <http ://www.gnu.org/licenses/>.
 */


package com.amaze.filemanager.services.ssh.tasks;

/**
 * Container for AsyncTask results. Allow either result object or exception to be contained.
 *
 * @param <T> Result type
 */

public class AsyncTaskResult<T> {
    private T result;
    private Throwable exception;

    public AsyncTaskResult(T result){
        this.result = result;
    }

    public AsyncTaskResult(Throwable exception){
        this.exception = exception;
    }

    public T getResult() {
        return result;
    }

    public Throwable getException() {
        return exception;
    }
}
