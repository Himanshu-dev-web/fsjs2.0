import React,{useState} from 'react'
import { useSelector } from 'react-redux';
import { useDispatch } from 'react-redux';
import { addTodo, removeTodo } from '../features/todoslice';



function Todos() {
  const todos = useSelector((state) => state.todos.todos)
  const dispatch = useDispatch();

  const [input, setInput] = useState('');
 
 
  return (
    <div>
    <div className='space-x-3'>
    <form action="" onSubmit={e => {
            if(input == ""){
              alert("Please enter any input");
              return;
            }
              e.preventDefault();
              dispatch(addTodo(input))
              setInput("");
        }}>
            <input type="text"
              className='mx-8   bg-gray-800 rounded border border-gray-700
              focus:border-indigo-500 focus:ring-2 focus:ring-indigo-900
              text-base outline-none text-gray-100 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out
              '
            placeholder='Enter a Task...'
            value={input}
            onChange={(e) => setInput(e.target.value)}
             />
             <button type='submit'  className='mx-4 text-white bg-indigo-500 border-0 py-2 px-6 rounded text-lg'>
              Add
             </button>
             </form>
        </div>

      {
        
        todos.map((todo) => (
          <>
          <ol className='flex items-center justify-center mt-6'>
          <li class="text-body-color mb-4 flex text-base">
            <span className='px-6 text-gray-800 rounded border border-gray-400' key={todo
            .key}> {todo.text}
            </span>
            <span onClick={() => dispatch(removeTodo(todo.id))}
              class="	 mx-[2rem] px-8 bg-gray-400 mr-2 flex h-6 w-full max-w-[24px] items-center justify-center rounded text-base text-white  cursor-pointer	"
            >
              Delete
            </span>
            <span onClick={() => dispatch(removeTodo(todo.id))}
              class="	 mx-[2rem] px-8 bg-gray-400 mr-2 flex h-6 w-full max-w-[24px] items-center justify-center rounded text-base text-white  cursor-pointer	"
            >
            Edit
            </span>
          </li>
          </ol>
          </>
        ))
       
      }
    </div>
  )
}

export default Todos;